a=int(input())
grades = list(map(int, input().split()))
m = max(grades)


for i in range(a):
    grades[i] = grades[i]/m * 100

print(sum(grades)/a)