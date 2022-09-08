class Node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None
     
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
print(mytree.name)
print(mytree.rootnode.left.data)
print(mytree.rootnode.right.data)