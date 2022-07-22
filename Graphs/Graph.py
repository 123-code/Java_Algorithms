import numpy as np
import Node 
class Graph:
    def __init__(self,vertices,edges):
        self.vertices = vertices
        self.edges = edges
        self.matrix = 0

    def creategraph(self):
    
       self.matrix = np.zeros((self.vertices,self.vertices))
       print(self.matrix)


    def connect(self,vertix1,vertix2):
        self.matrix[vertix1][vertix2] = 1
        self.matrix[vertix2][vertix1] = 1
        Node.Node.setconnectedto(vertix2)
        print(self.matrix)


    def disconnect(self,vertix1,vertix2):
        self.matrix[vertix1][vertix2] = 0
        self.matrix[vertix2][vertix1] = 0
        print(self.matrix)


def run():
    people = []
    while True:
        name = input('enter your name')
        age = int(input("enter your age"))
        people.append(1)
        n1 = Node.Node(name,age)
        if name == '' and age == 0:
            break


    

    g1 = Graph(len(people),len(people))
    g1.creategraph()
    g1.connect(0,1)
         


if __name__ == "__main__":
    run()




        

        