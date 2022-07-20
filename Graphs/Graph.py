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
        print(self.matrix)


    def disconnect(self,vertix1,vertix2):
        self.matrix[vertix1][vertix2] = 0
        self.matrix[vertix2][vertix1] = 0
        print(self.matrix)

        


g1 = Graph(10,10)
g1.creategraph()
g1.connect(0,1)



        

        