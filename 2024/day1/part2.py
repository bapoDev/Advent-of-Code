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

    for j in range(file_len) :
        count = 0
        for k in range(file_len) :
            if left_list[j] == right_list[k]:
                count += 1
        res += left_list[j] * count
        
    return res;

if __name__ == '__main__':
    print(addup());