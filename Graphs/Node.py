class Node:
    def __init__(self,name,age):
        self.name = name
        self.age = age 
        self.neighbours = []
        self.connected = False
        self.connectedto = self

    def add_neighbour(self,neighbour):
        self.neighbours.append(neighbour)
        print(self.neighbours)

    def setconnectedto(self,node):
        self.connectedto = node
        print(self.connectedto)


    
