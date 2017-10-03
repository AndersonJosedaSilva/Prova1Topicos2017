package prova1topicos2017;

import javax.servlet.jsp.jstl.sql.Result;

public class fibCalculo {
	

	public int Fib(int n) {
		  int lo = 0;
	      int hi = 1;
	      for (int i = 0; i < n; i++) {
	          hi = lo + hi;
	          lo = hi - lo;
	      }
	      return lo;
	}
}
