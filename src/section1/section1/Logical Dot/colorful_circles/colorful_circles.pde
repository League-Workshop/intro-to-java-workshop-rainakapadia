void setup(){
  size(800,800);
}
void draw(){
 fill(#4386BF);
  ellipse(mouseX,mouseY,100,100);
 if(mousePressed){
   fill(#F53441);
 ellipse(mouseX,mouseY,100,100);
 }
}