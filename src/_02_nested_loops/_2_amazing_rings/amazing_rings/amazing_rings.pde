
int lex=250;
int light=250;
int france= 1;

int rats=750;
int hurgle=250;
int portugal=-1;

void setup() {
  size(1000,500);
  frameRate(49);
}

void draw() {
  background(#CBC9C9);
  // Go to the recipe to run the demonstration before starting this program
  for(int v=250; v>=1; v-=8) {
      
          noFill();
  ellipse(lex, light, v, v);
}
  lex+=france;
  if (lex>750){
france=-1;
  }
else if( lex<250){
  france=1;
  }
  
  for(int v=250; v>=1; v-=8) {
      
          noFill();
  ellipse(rats, hurgle, v, v);
}
  rats+=portugal;
  if (rats<750){
portugal=-1;
  }
else if( rats>250){
  portugal=1;
  }
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
