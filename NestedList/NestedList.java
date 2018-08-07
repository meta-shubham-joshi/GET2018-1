import java.util.ArrayList;

public interface NestedList {
	
	int sum();//evaluates sum of all values in nested list
	int largestValue();//evaluates largest value from the nested list
	ArrayList<Integer> findValue(int value);// finds a value
	void add(NestedList item);//adds a list or value or nested list in the current nested list
}
