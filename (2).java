import java.util.*;
import java.io.*;
public class TestClass {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);
PrintWriter out = new PrintWriter(System.out);
int size = Integer.parseInt(scan.nextLine());
String intList[] = scan.nextLine().split(" ");
ArrayList<Integer> list = new ArrayList<>();
for(int i=0;i<intList.length;i++) {
list.add(Integer.parseInt(intList[i]));
}
int count = 0;
int expected = 1;
Stack<Integer> stack = new Stack<>();
while(count < size) {
if(expected == list.get(count)) {
expected += 1;
count += 1;
continue;
}
if(!stack.isEmpty()) {
int top = stack.peek();
if(top == expected) {
stack.pop();
expected += 1;
continue;
}
}
stack.push(list.get(count));
count += 1;
}
while(!stack.isEmpty()) {
int top = stack.peek();
if(expected == top) {
stack.pop();
expected += 1;
}
else {
break;
}
}
if((expected-1) == size) {
out.println("Happy");
} else {
out.println("Sad");
}
scan.close();
out.close();
}
}