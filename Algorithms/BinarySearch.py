data = [23,43,56,21,32,11,44,89,65,49]


# data sorting algorithm
def datasorting(data):
  
  for i in range(1,len(data)):
    key = data[i]
    j = i-1

    while(j>=0 and key<data[j]):
      
        data[j+1] = data[j]

        j-=1
      

    data[j+1]=key

# search algorithm
def BinarySearch(element,data):
  low =data[0]
  high = data[len(data)-1]
  medio = (high-low)/2
  if(element > data[len(data)-1] or element < data[0]):
    print("elemento no encontrado")
    return -1

  while(low<=high):
    
    if(element > medio):
      high =  medio+1
    elif(element < medio):
      high =  medio-1
    elif(element == medio):
      
      print(f"elemento encontrado")
    return element
  
  return -1


# test code
element = 11
datasorting(data)
print(data)
resultado = BinarySearch(element,data)

if(resultado != -1):
  print("element not found")

else:
  print("element has been found!")
  

  
    
      
    

  

  
    

  
    
  