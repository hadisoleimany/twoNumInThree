def check_num(n):
    disct_num = set()
    for i in range(1, 4):
        tmp = n % 10
        disct_num.add(tmp)
        n = n // 10
    if 0 in disct_num or disct_num.__len__() != 2:
        return False
    else:
        return True


numbers = range(100, 999)
count = 0
for num in numbers:
    if check_num(num):
        count += 1
print(count)
