class Node:
    def __init__(self,name,age):
        self.name = name
        self.age = age 
        self.neighbours = []

    def add_neighbour(self,neighbour):
        self.neighbours.append(neighbour)
        print(self.neighbours)
