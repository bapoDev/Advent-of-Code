import sys

file = open(sys.argv[1], "r")
file_len = 1000
def addup():
    left_list = []
    right_list = []
    res = 0

    for i in range(file_len) :
        line = file.readline()
        number_list = line.split()
        left_list.append(int(number_list[0]))
        right_list.append(int(number_list[1]))

    left_list = sorted(left_list)
    right_list = sorted(right_list)

    for j in range(file_len) :
         res += abs(right_list[j] - left_list[j])

    return res;

if __name__ == '__main__':
    print(addup());