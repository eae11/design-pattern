package pattern.C16Interpreter.sample02;

/*AbstractNode充当抽象表达式角色，DirectionNode、ActionNode和DistanceNode充
当终结符表达式角色，AndNode和SentenceNode充当非终结符表达式角色。
*/
//抽象表达式
abstract class AbstractNode {
    public abstract String interpret();
}