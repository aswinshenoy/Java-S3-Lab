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

#### 3. Backspace String
```
Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
```

```java
public String build(String s)
{
    Stack<Character> stk = new Stack<Character>();
    for(Character c: s.toCharArray())
    {
        if(c=='#'&&!stk.empty())
            stk.pop();
        else if(c!='#')
            stk.push(c);
    }
    return stk.toString();
}

public boolean backspaceCompare(String S, String T) {
    String Sb = build(S);
    String Tb = build(T);
    return Sb.equals(Tb);
}
```

#### 4. String Pattern Decoding

```
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef"
```

```java
public String decodeString(String s) {
    Stack<Integer> intStk = new Stack<Integer>();
    Stack<StringBuilder> strStk = new Stack<StringBuilder>();
    StringBuilder curr = new StringBuilder();
    int ng = 0;
    for(char c : s.toCharArray())
    {
        if(Character.isDigit(c))
             ng = ng*10 + c - '0';
        else if(c=='[')
        {
            intStk.push(ng);
            ng = 0;
            strStk.push(curr);
            curr = new StringBuilder();
        }
        else if(c==']')
        {
            StringBuilder encoded_str = curr;
            curr = strStk.pop();
            for(int i = intStk.pop(); i>0; --i) 
                curr.append(encoded_str);
        }
        else
            curr.append(c);
    }
    return curr.toString();
}
```


