from queue import Queue
import time 


current_time = time.time();
print(current_time)


q = Queue(maxsize=100)
print("Round Robin Algorithm python")
print(q.qsize())

data = [1,2,3,4,5,6,7,8,9]

for i in range(len(data)):
  q.put(data[i])


def atender(data):
  for i in range(len(data)):
    print(f"Serving:{data[i]}")
    q.get()

  print("Process ended")
  return q.queue
    

#test code code surely has bugs to fix 
print(q.get())
print(q.queue)

atender(data)




def RoundRobin(qtm,time):
    pass
