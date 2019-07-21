#### 1. Parenthesis is Valid

```java
public boolean isValid(String s) {
    if(s.length() % 2 !=0) return false;
    
    Stack stk = new Stack();
    
    for(char c: s.toCharArray())
    {
        if(c=='{') stk.push('}');
        else if(c=='(') stk.push(')');
        else if(c=='[') stk.push(']');
        else if(stk.empty() || !stk.pop().equals(c))
            return false;
    }
    return stk.empty();
}
```

#### 2. Evaluate Postfix Expression (Reverse Polish Notation)
```java
public int evalRPN(String[] tokens){
    Stack<Integer> stk = new Stack<Integer>();
    
    for(String s: tokens)
    {
        if(s.equals("+"))
            stk.push(stk.pop() + stk.pop());
        else if(s.equals("-"))
        {
            int b = stk.pop();
            int a = stk.pop();
            stk.push(a-b);
        }
        else if(s.equals("*"))
            stk.push(stk.pop() * stk.pop());
        else if(s.equals("/"))
        {
            int b = stk.pop();
            int a = stk.pop();
            stk.push(a/b);
        }
        else{
            stk.push(Integer.parseInt(s));
        }
    }
    return stk.pop();
}
```