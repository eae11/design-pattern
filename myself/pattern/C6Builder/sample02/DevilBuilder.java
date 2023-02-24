package pattern.C6Builder.sample02;

//恶魔角色建造器：具体建造者
class DevilBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("恶魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("丑陋");
    }

    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
    //通过钩子方法来控制产品的构建

    @Override
    public boolean isBareheaded() {
        return true;
    }
}