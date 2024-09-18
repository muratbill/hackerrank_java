package JavaMethodOverlriding;

class Soccer extends Sports {
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName());
    }
    public void printMessage(){
        System.out.println(super.getName());
        super.getNumberOfTeamMembers();
        System.out.println(super.getName());
        System.out.println(getName());
        getNumberOfTeamMembers();
    }
}
