class Node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None


    def searchtree(self,element):

      if self.data == element:
          print(f'Found:{self.data}!')
          return self

      if(self.right and self.data >element):
          return self.left.searchtree(element)
        


      if(self.left and self.data <element):
          return self.right.searchtree(element)

      print("Element Not Found in tree")
     
class Tree:
    def __init__(self,rootnode,name=""):
        self.rootnode = rootnode
        self.name=name


    
node = Node(10)
node.left = Node(6)
node.right = Node(15)

node.left.left = Node(2)
node.left.right = Node(7)
node.right.left = Node(13)
node.right.right = Node(10000)


mytree = Tree(node,'JoseIgnacio')
found = mytree.rootnode.searchtree(7)
print(found.data)