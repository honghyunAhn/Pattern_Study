package facade;

public class Facade {
	private String beverage_Name;
    private String Movie_Name;
    
    public Facade(String beverage_Name,String Movie_Name)
    {
        this.beverage_Name = beverage_Name;
        this.Movie_Name = Movie_Name;
    }
    
    public void view_Movie()
    {	
        Beverage beverage = new Beverage(beverage_Name);
        Remote_Control remote= new Remote_Control();
        Movie movie = new Movie(Movie_Name);
        
//      음료수를 준비
        beverage.Prepare();
//      리모컨으로 티비 켬
        remote.Turn_On();
//      영화 검색
        movie.Search_Movie();
//      영화 결제
        movie.Charge_Movie();
//      영화 재생
        movie.play_Movie();
    }
}
