package org.example;

import java.util.Scanner;

public class Adventure {
  private static final String START_ROOM =
      "You find yourself standing in a dimly lit room. A musty smell fills the air and the walls are covered in cobwebs. A faint light flickers from a doorway to the east.";
  private static final String EAST_ROOM =
      "You step through the doorway and enter a larger room with a grand fireplace. A dusty chandelier hangs from the ceiling, casting dancing shadows on the walls. A door stands to the north and a passage leads to the west.";
  private static final String NORTH_ROOM =
      "You open the door and find yourself in a winding staircase. It creaks and groans as you ascend. The air grows cooler and you hear the distant sound of dripping water.";
  private static final String WEST_ROOM =
      "The passage leads to a damp and mossy cave. Strange noises echo from the darkness. You see a glimmer of light in the distance.";
  private static final String CAVE_ROOM =
      "You venture deeper into the cave and the light grows brighter. You emerge into a clearing and see a magnificent waterfall cascading down a sheer rock face. A rainbow arcs across the sky, mirroring the colors of the waterfall.";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(START_ROOM);
    String currentRoom = START_ROOM;

    while (true) {
      System.out.println("Which direction do you want to go? [N/E/W]");
      String direction = scanner.next();

      if (direction.equals("E")) {
        currentRoom = EAST_ROOM;
      } else if (direction.equals("N")) {
        currentRoom = NORTH_ROOM;
      } else if (direction.equals("W")) {
        currentRoom = WEST_ROOM;
      } else {
        System.out.println("Invalid direction. Please enter N, E, or W.");
        continue;
      }

      System.out.println(currentRoom);
    }
  }
}
