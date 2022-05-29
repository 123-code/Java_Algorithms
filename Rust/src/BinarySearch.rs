// Binary search Algorithm written in Rust.
pub fn run(data: Vec<i32>,element:<i32>)->i32{
    let mut center = (low + high) / 2;
    let mut low = data[0];
    let mut high = data.len();

  if  element = center{
      println!("Elemento encontrado");  
  }

  else if(element > center){
      low = center+1;
      println!("{}",low);
  }

  else if(element < center){
    high = center-1;
    println!("{}",high);
}
return -1; 



}