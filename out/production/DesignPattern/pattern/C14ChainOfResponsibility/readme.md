(1) 纯的职责链模式
一个纯的职责链模式要求一个具体处理者对象只能在两个行为中选择一个：要么承担全部责
任，要么将责任推给下家，不允许出现某一个具体处理者对象在承担了一部分或全部责任后
又将责任向下传递的情况。而且在纯的职责链模式中，要求一个请求必须被某一个处理者对
象所接收，不能出现某个请求未被任何一个处理者对象处理的情况。在前面的采购单审批实
例中应用的是纯的职责链模式。
(2)不纯的职责链模式
在一个不纯的职责链模式中允许某个请求被一个具体处理者部分处理后再向下传递，或者一
个具体处理者处理完某请求后其后继处理者可以继续处理该请求，而且一个请求可以最终不
被任何处理者对象所接收。Java AWT 1.0中的事件处理模型应用的是不纯的职责链模式，其基
本原理如下：由于窗口组件（如按钮、文本框等）一般都位于容器组件中，因此当事件发生
在某一个组件上时，先通过组件对象的handleEvent()方法将事件传递给相应的事件处理方法，
该事件处理方法将处理此事件，然后决定是否将该事件向上一级容器组件传播；上级容器组
件在接到事件之后可以继续处理此事件并决定是否继续向上级容器组件传播，如此反复，直
到事件到达顶层容器组件为止；如果一直传到最顶层容器仍没有处理方法，则该事件不予处
理。每一级组件在接收到事件时，都可以处理此事件，而不论此事件是否在上一级已得到处
理，还存在事件未被处理的情况。显然，这就是不纯的职责链模式，早期的Java AWT事件模
型(JDK 1.0及更早)中的这种事件处理机制又叫事件浮升(Event Bubbling)机制。从Java.1.1以
后，JDK使用观察者模式代替职责链模式来处理事件。目前，在JavaScript中仍然可以使用这
种事件浮升机制来进行事件处理。

1.主要优点
职责链模式的主要优点如下：
(1) 职责链模式使得一个对象无须知道是其他哪一个对象处理其请求，对象仅需知道该请求会
被处理即可，接收者和发送者都没有对方的明确信息，且链中的对象不需要知道链的结构，
由客户端负责链的创建，降低了系统的耦合度。
(2) 请求处理对象仅需维持一个指向其后继者的引用，而不需要维持它对所有的候选处理者的
引用，可简化对象的相互连接。
(3) 在给对象分派职责时，职责链可以给我们更多的灵活性，可以通过在运行时对该链进行动
态的增加或修改来增加或改变处理一个请求的职责。
(4) 在系统中增加一个新的具体请求处理者时无须修改原有系统的代码，只需要在客户端重新
建链即可，从这一点来看是符合“开闭原则”的。
2.主要缺点
职责链模式的主要缺点如下：
(1) 由于一个请求没有明确的接收者，那么就不能保证它一定会被处理，该请求可能一直到链
的末端都得不到处理；一个请求也可能因职责链没有被正确配置而得不到处理。
(2) 对于比较长的职责链，请求的处理可能涉及到多个处理对象，系统性能将受到一定影响，
而且在进行代码调试时不太方便。
(3) 如果建链不当，可能会造成循环调用，将导致系统陷入死循环