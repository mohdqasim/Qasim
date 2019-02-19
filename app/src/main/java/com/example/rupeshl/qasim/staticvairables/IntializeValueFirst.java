package com.example.rupeshl.qasim.staticvairables;
public class IntializeValueFirst{
	public  void main(){
		StaticVairable.URL="url_from_intialize_value";
		StaticVairable.HOST="host_from_intialize_value";
		System.out.println(" ivf URL "+StaticVairable.URL);
		System.out.println("ivf HOST "+StaticVairable.HOST);
		System.out.println("ivf HOST + url"+StaticVairable.URl_HOST);
	}
}