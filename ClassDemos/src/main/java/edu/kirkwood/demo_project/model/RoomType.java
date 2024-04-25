package edu.kirkwood.demo_project.model;

public enum RoomType {
    SINGLE_KING("Single King")
    , SINGLE_QUEEN("Single Queen")
    , DOUBLE_QUEEN("Double Queen");
    
    private String description;

    RoomType(String description) {
        this.description = description;
    }

    public static RoomType getRoomType(String description) {
        for(RoomType roomType : RoomType.values()) {
            if(roomType.description.equalsIgnoreCase(description)) {
                return roomType;
            }
        }
        return RoomType.SINGLE_KING;
    }

    public String toString() {
        return description;
    }
}
