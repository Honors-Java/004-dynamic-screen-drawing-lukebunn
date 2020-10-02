 void setup() {
	size(300, 300);
  background(155);
}

void draw(){
   




}

//dont forget to add mouse and keypressed interaction functions
void mousePressed()  { 
      stroke(0);
      fill(mouseX, 0);
      rect(mouseX, mouseY, 40, 30);
      rectMode(CENTER);
    }
void keyPressed() {
  background(0,50,0,0);
}