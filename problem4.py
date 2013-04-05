# Pretty brute force-ish way of attacking this problem.
# Just wanted to keep it simple stupid, plus python can handle it ;)
# Answer: 906609
def problem4():
  results = []
  for i in reversed(range(999)):
    for j in reversed(range(999)):
      result = str(i*j)
      if result == result[::-1]:
        results.append(int(result))
  return max(results)

print problem4() # prints 906609
