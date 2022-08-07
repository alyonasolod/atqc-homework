package week2.task4;

public enum StateMachine {
    MAIN_MENU(0),
    ADD_DEVICE_MANUALLY(1),
    ADD_DEVICE_AUTO(2),
    VIEW_DEVICE_LIST_MAIN(3),
    VIEW_DEVICE_LIST_SORTED_BY_DEFAULT(4),
    VIEW_DEVICE_LIST_SORTED_BY(5),
    GET_PHONE_DETAILS_BY_INDEX(6),
    EXIT(7);
    int index=0;
    StateMachine(int i){
        this.index=i;
    }

}
