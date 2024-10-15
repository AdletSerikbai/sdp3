# Adapter Pattern - Audio Player

## Overview

This project demonstrates the **Adapter Design Pattern** by creating a music player application that supports multiple audio formats (MP3, WAV, and AAC). The application initially only supports MP3 files, but with the help of the adapter pattern, it can now also play WAV and AAC files without modifying the existing player code.

### Problem Scenario:
The task was to add support for WAV and AAC files to an MP3 player application. Using the Adapter Pattern, we introduce the ability to play these new formats without altering the existing MP3 player logic.

## Project Structure

The project consists of the following Java classes:

- **AudioPlayer.java**: An interface that defines the method `play(String audioType, String fileName)` for playing different types of audio files.
- **MP3Player.java**: A concrete class that implements the `AudioPlayer` interface and can only play MP3 files.
- **WAVPlayer.java**: An interface that defines the method `playWAV(String fileName)` for playing WAV files.
- **AACPlayer.java**: An interface that defines the method `playAAC(String fileName)` for playing AAC files.
- **AdvancedAudioPlayer.java**: A class that implements both `WAVPlayer` and `AACPlayer`, making it capable of playing both WAV and AAC files.
- **AudioAdapter.java**: An adapter class that enables the `AudioPlayer` to support WAV and AAC formats by using `AdvancedAudioPlayer`.
- **MusicPlayerApp.java**: The main class that demonstrates the working of the adapter pattern by playing MP3, WAV, and AAC files.

## How the Adapter Pattern is Used

The `AudioAdapter` class is the key part of this project. It adapts the `AdvancedAudioPlayer` (which can play WAV and AAC) so that it works seamlessly with the existing `AudioPlayer` interface. By doing so, the application can now handle multiple audio formats without changing the core `MP3Player` code.

### Key Components:

1. **AudioPlayer (Interface)**: Defines a standard way to play audio files.
2. **MP3Player (Class)**: Implements `AudioPlayer` and plays MP3 files.
3. **AdvancedAudioPlayer (Class)**: Implements `WAVPlayer` and `AACPlayer` to play WAV and AAC files.
4. **AudioAdapter (Class)**: Acts as a bridge between `AudioPlayer` and `AdvancedAudioPlayer` to support multiple audio formats.
5. **MusicPlayerApp (Class)**: Demonstrates the usage of the adapter pattern to play different audio formats.

## How to Run

1. **Compile the Code**:  
   Use the following commands to compile the code:
   ```bash
   javac AudioPlayer.java MP3Player.java WAVPlayer.java AACPlayer.java AdvancedAudioPlayer.java AudioAdapter.java MusicPlayerApp.java
   ```

2. **Run the Application**:  
   Use the following command to run the program:
   ```bash
   java MusicPlayerApp
   ```

3. **Expected Output**:
   ```
   Playing mp3 file: song1.mp3
   Playing wav file: song2.wav
   Playing aac file: song3.aac
   ```

## Requirements

- Java JDK (8 or higher)

## Conclusion

This project demonstrates how the Adapter Pattern can be applied to extend the functionality of an existing system in a flexible manner. The MP3 player now supports additional formats (WAV and AAC) without needing to alter the existing player code, keeping the system maintainable and scalable.

---

You can copy this content and save it as `README.md` in your project folder.

Would you like help with anything else?
