// we have another node as the next element, so memory has to be allocated dynamically.
pub struct Node{
    data:i32,
    next: Option<Box<Node>>,
}

impl Node{
    fn new(val:i32) -> Node{
        Node{
            val,
            next:None,
        }
    }
}

fn to_list(vector:Vec<i32>) -> Option<Box<Node>>{
    let mut current = none;

    for &value in vector.iter(){
        
    }
}

pub fn run(){
let node = Node{val:0,next: Some(Box::new(Node::new(1)))};
let vector = vec![0,1,2,3,4,5];
}