data = [23,43,56,21,32,11,44,89,65,49]

 
def menortomayor(data):
 
    for i in range(1,len(data)):

        key = data[i]

        j = i -1

        while(j>=0 and key<data[j]):

            data[j+1] = data[j]
       
            j-=1
            
        data[j+1] = key


def mayortomenor(data):
    # enter for loop from second element
    for i in range(1,len(data)):
        # take an element out, starting from the second one 
        key = data[i]
        # move the elemet to compare with key through array
        j = i-1

# while j >= 0 and current element greater than element behind
        while(j>=0 and key>data[j]):
            #move smaller  element to the right
            data[j+1] = data[j]
            # move comp
            j-= 1
            # assign place to last key element
        data[j+1] = key

# Driver code to test above
menortomayor(data)
print(data)

mayortomenor(data)
print(data)