package facade;

public class Movie {
	
	private String name;
    
    public Movie(String name)
    {
        this.name = name;
    }
    
    public void Search_Movie()
    {
        System.out.println("3-1 " + name +" 영화를 찾다");
    }
        public void Charge_Movie()
    {
        System.out.println("3-2 영화를 결제하다");
    }
    public void play_Movie()
    {
        System.out.println("3-3 영화 재생");
    } 
}
