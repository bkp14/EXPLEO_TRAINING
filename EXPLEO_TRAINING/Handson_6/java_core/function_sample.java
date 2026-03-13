package java_core;

public class function_sample {
	 void fun(String movie,String duration,String lang,String genre) {
		System.out.println("movie: "+movie);
		System.out.println("duration: "+duration);

		System.out.println("lang: "+lang);

		System.out.println("genre: "+genre);

		
	}
	 function_sample(String movie,String duration,String lang,String genre){
			System.out.println("movie: "+movie);
			System.out.println("duration: "+duration);

			System.out.println("lang: "+lang);

			System.out.println("genre: "+genre);
	 }
	 function_sample(){
		 
	 }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       String movie="durandhar";
       String duration="3 hours";
       String lang="hindi";
       String genre="action";
       function_sample ob = new function_sample( movie, duration, lang, genre);
       function_sample ob1 = new function_sample();

       ob1.fun(movie,duration,lang,genre);
	}

}
