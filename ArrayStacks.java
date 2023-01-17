public class ArrayStacks {
        Object stackss[];
        int top;
        int size;

        public ArrayStacks(int size)
        {
            this.size = size;
            stackss = new Object[this.size];
            top = -1;
        }

        public void push(int x)
        {
            if (top == size - 1)
            {
                System.out.println("Stack Overflow");
            }
            else
            {
                stackss[++top] = x;
                System.out.print(x+" ");

            }

        }

        public boolean equals(ArrayStacks stack2)
        {
            if (top != stack2.top)
                return false;

            for (int i = 0; i <= top; i++)
                if (stackss[i] != stack2.stackss[i])

                    return false;

            return true;
        }
    }

    class Main
    {
        public static void main(String[] args)
        {
            ArrayStacks stack1 = new ArrayStacks(3);
            ArrayStacks stack2 = new ArrayStacks(3);


            stack1.push(7);
            stack1.push(8);
            stack1.push(9);

            stack2.push(7);
            stack2.push(8);
            stack2.push(9);


            System.out.println(stack1.equals(stack2));
        }
    }


