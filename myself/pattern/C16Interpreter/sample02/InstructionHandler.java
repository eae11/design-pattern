package pattern.C16Interpreter.sample02;

import java.util.ArrayDeque;

public class InstructionHandler {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left, right;
        AbstractNode direction, action, distance;
        ArrayDeque<AbstractNode> stack = new ArrayDeque<>(); //声明一个栈对象用于存储抽象语法树
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            //本实例采用栈的方式来处理指令，如果遇到“and”，则将其后的三个单词作为三个终结符表达式连成一个简单句子SentenceNode作为“and”的右表达式，
            // 而将从栈顶弹出的表达式作为“and”的左表达式，最后将新的“and”表达式压入栈中。
            if (words[i].equalsIgnoreCase("and")) {
                left = stack.pop();
                direction = new DirectionNode(words[++i]);
                action = new ActionNode(words[++i]);
                distance = new DistanceNode(words[++i]);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
                //如果是从头开始进行解释，则将前三个单词组成一个简单句子SentenceNode并将该句子压入栈中
            } else {
                direction = new DirectionNode(words[i]);
                action = new ActionNode(words[++i]);
                distance = new DistanceNode(words[++i]);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = stack.pop();
    }

    public String output() {
        return node.interpret(); //解释表达式
    }
}