class sevenwonders {  
  void location(){
System.out.println("Location is:");
}  
void famousfor(){
System.out.println("Famous for:");
}  
  }

class Great_Wall_of_China extends sevenwonders {  
  void location(){
System.out.println("Great Wall of China is in Beijing");
}  
void famousfor(){
System.out.println("It is Famous for its historical significance and architectural grandeur");
}  
  }
class Taj_Mahal  extends sevenwonders {  
  void location(){
System.out.println("Taj Mahal is in Agra");
}  
void famousfor(){
System.out.println("It is Famous for its architectural beauty and romantic history");
}  
  }
class The_Colosseum extends sevenwonders {  
  void location(){
System.out.println("The Colosseum is in Rome");
}  
void famousfor(){
System.out.println("It is Famous for its historical significance and architectural grandeur");
}  
  }
class Christ_the_Redeemer extends sevenwonders {  
  void location(){
System.out.println("Christ the Redeemer is in Rio de Janeiro");
}  
void famousfor(){
System.out.println("It is Famous for its historical significance and architectural grandeur");
}
 }
class Chichén_Itzá extends sevenwonders {  
  void location(){
System.out.println("Chichén Itzá is in Mexico");
}  
void famousfor(){
System.out.println("It is Famous for its historical significance and architectural grandeur");
}
 }
 class Machu_Picchu extends sevenwonders {  
  void location(){
System.out.println("Machu Picchu is in Peru");
}  
void famousfor(){
System.out.println("It is Famous for its historical significance and architectural grandeur");
}
 }
class sevenwonderS_polymorfosis {
  public static void main(String args[]){ 
    sevenwonders A = new sevenwonders();
    sevenwonders M = new Great_Wall_of_China();
 
    sevenwonders Mu = new Taj_Mahal();
 
    sevenwonders G = new The_Colosseum();
    sevenwonders C = new Christ_the_Redeemer();
    sevenwonders Ch = new Chichén_Itzá();
    sevenwonders Ma = new Machu_Picchu();

    A.location();
	A.famousfor();
   
	M.location();
	M.famousfor();
 
	Mu.location();
	Mu.famousfor();
 
	G.location();
	G.famousfor();

  C.location();
  C.famousfor();

  Ch.location();
  Ch.famousfor();

  Ma.location();
  Ma.famousfor();
  }  
}  