void setup() {
size(500,500);
}
void draw() {
  fill(#F25607);
  if(mousePressed) {
    fill(#F2073E);
  }else{
    fill(#0E07F2);
  }
  ellipse(500,500,500,500);
}
