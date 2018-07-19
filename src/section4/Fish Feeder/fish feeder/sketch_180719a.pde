int foodX = 100;
int foodY = 20;
void setup(){
  size(800,800);
}
void draw(){
  background(#0D71FA);
  fill(#EDFF03);
  noStroke();
  ellipse(foodX,foodY,50,50);
   if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
  if(mouseX>45&&mouseY>799){
    background(#0D71FA);
  fill(#EDFF03);
  noStroke();
  ellipse(foodX,foodY,50,50);
  }
    
}
void drawFish(){
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-17,mouseY-17,20,20); //back side eye
     fill(255,200,88);
     ellipse(mouseX,mouseY,90,50); //body
     triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail
     stroke(0);
     triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin
     noStroke();
     fill(255,200,88);
     ellipse(mouseX,mouseY,15,15); //side fin cover
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-25,mouseY-15,20,20); //front eye
     fill(0,0,0);
     ellipse(mouseX-25,mouseY-15,5,5); //pupil
     fill(141,233,237);
     ellipse(mouseX-45,mouseY,25,25); //mouth
}
  