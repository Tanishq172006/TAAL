<div align="center">
    <img src="composeApp/Logo/logo.png" alt="Logo" width="120" height="120">

  <h3 align="center">T A A L</h3>

  <p align="center">
    <b>TAAL</b> is a modern <b>cross-platform music creation app</b> designed to make beat creation simple, powerful, and fun.  
  </p>

<p align="center">
  <a href="https://github.com/Tanishq172006/TAAL/releases">
    <img src="https://img.shields.io/badge/Download-Latest_Release-black?style=for-the-badge"/>
  </a>
</p>
</div>

---

<h4><b>The Team DEVEORA ♡</b></h4>

TAAL = Tanishq • Ananya • Anshul • Lavanya

---

<h3><b>Platforms Supported</b></h3>
 
 * **Android**
 * **Windows**
 * **MacOS**
 * **Linux**
 * **iOS (in progress)**
 * **Web (in progress)**

---

<h3><b>Core Features</b></h3>

### Music Creation🎵 
  * Create and edit beats using:
    - Drum Editor 🥁 
    - Guitar Editor 🎸 
    - Piano Roll Editor  🎹 

* Additional tools:
  - Step sequencer with real-time playback  
  - Metronome for timing precision  

### Audio Power 🎧 
- Import custom audio files and instruments  
- Built-in soundfonts for playback  
- Real-time mixing and layering  

### Export & Storage 💾 
 * Export your creations as:
    - `.WAV`  
    - `.MIDI`  

 * Features:
    - Save projects locally  
    - Open export folder directly from the app  

### User Modes
- 🟢 **Beginner** → Simple & intuitive  
- 🟡 **Intermediate** → More control  
- 🔴 **Advanced** → Full customization  

---

<h3><b>Built With</b></h3>

* [![Kotlin][Kotlin-badge]][Kotlin-url]
* [![Compose][Compose-badge]][Compose-url]
* [![C++][CPP-badge]][CPP-url]
* [![Firebase][Firebase-badge]][Firebase-url]
* [![SQLDelight][SQLDelight-badge]][SQLDelight-url]
* [![Gradle][Gradle-badge]][Gradle-url]

---

<h3><b>Project Structure </b></h3>

```sh
TAAL/
├── composeApp/
│   ├── commonMain/       # Shared UI + logic
│   ├── androidMain/      # Android-specific
│   ├── iosMain/          # iOS (WIP)
│   ├── jvmMain/          # Desktop builds
│   ├── jsMain/           # Web support
│   └── cpp/              # Native audio engine
├── iosApp/               # iOS wrapper
└── gradle/               # Build system
```
---

<h3><b>Screenshots (cheese) 🧀</b></h3>

### Android View 📱

<p align="center">
  <img width="220" src="https://github.com/user-attachments/assets/27bfcb40-9b1e-4a56-b86a-5c6eb9693bca" />
  <img width="220" src="https://github.com/user-attachments/assets/880f203c-3d86-46b5-b4f5-365680e63bd1" />
  <img width="220" src="https://github.com/user-attachments/assets/d85fb899-323d-42c1-b601-739ef3e59d22" />
</p>

<p align="center">
    <img width="220" src="https://github.com/user-attachments/assets/0f0979dd-c3a0-4e98-ae0a-47e2f0b60598" />
    <img width="220" src="https://github.com/user-attachments/assets/0dd2feac-97b4-4c68-b610-93f11538e805" />
</p>

### Desktop View 💻 

<p align="center">
  <img width="350" src="https://github.com/user-attachments/assets/e31be7a8-a03d-4ba3-8ad6-e6a2573394b8" />
  <img width="350" src="https://github.com/user-attachments/assets/6942274b-a8fe-42f4-a445-ef1d988874f5" />

</p>

<p align="center">
  <img width="350" src="https://github.com/user-attachments/assets/92a5161a-e7a1-472d-b0af-1e73e9ca93d3" />
  <img width="350" src="https://github.com/user-attachments/assets/8aca446c-d34d-4152-85f6-bf9105214471" />

</p>

---

<h3><b>Demo (action) 🎬</b></h3>

<p align="center">
  <a href="https://youtu.be/iy-p2-X0yrs">
    <img src="https://img.shields.io/badge/YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white"/>
  </a>
</p>

---

<h3><b>Releases</b></h3>

You can download the latest version of **TAAL** for your platform below.

### Download Latest (v1.0.1)

* [Android (.apk)](https://github.com/Tanishq172006/TAAL/releases/download/v1.0.1/TAAL-v1.0.1.apk)
* [Windows (.msi)](https://github.com/Tanishq172006/TAAL/releases/download/v1.0.1/TAAL-1.0.1.msi)
* [macOS (.dmg)](https://github.com/Tanishq172006/TAAL/releases/download/v1.0.1/TAAL-1.0.1.dmg)
* [Linux (.deb)](https://github.com/Tanishq172006/TAAL/releases/download/v1.0.1/taal_1.0.1_amd64.deb)

### Installation Guide

* **Android (.apk)**  
  Enable "Install from unknown sources" and install the APK.

* **Windows (.msi)**  
  Run the installer and follow the setup.

* **MacOS (.dmg)**  
  Drag the app into Applications.

* **Linux (.deb)**  
  ```sh
  sudo dpkg -i taal_1.0.1_amd64.deb
  ```

[View all releases](https://github.com/Tanishq172006/TAAL/releases)

---

<h3><b>Getting Started</b></h3>

Follow these steps to run TAAL locally.

### Prerequisites

* JDK 17+

  ```sh
  java -version
  ```

* Gradle (wrapper included)

* Android Studio / IntelliJ IDEA

* Xcode (for iOS)

### Installation

1. Clone the repository

   ```sh
   git clone https://github.com/Tanishq172006/TAAL.git
   ```

2. Navigate to the project

   ```sh
   cd TAAL
   ```

3. Build the project

   ```sh
   ./gradlew build
   ```

4. Run the app

   Desktop:

   ```sh
   ./gradlew run
   ```

   Android:

   * Open in Android Studio
   * Click Run 

   iOS:

   * Open `iosApp` in Xcode
   * Run on simulator/device


---

<h3><b>bts- behind the scenes 😉</b></h3>

- Check out our **Devlog** where we documented the journey
- and our love-hate relationship with GRADLE
  
[devlog](./dEVLOG.md)

---

<h3><b>short note :) 🧃</b></h3>

- a really crazy app (imo), made just in some weeks
- yea we did fight with GRADLE alot
- and ig we deserve some chocolates, right? 😋🍫 
- enjoy TAAL <3

---
made with lots of loveee.

[Kotlin-badge]: https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white
[Kotlin-url]: https://kotlinlang.org/
[Compose-badge]: https://img.shields.io/badge/Compose_Multiplatform-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white
[Compose-url]: https://www.jetbrains.com/lp/compose-multiplatform/
[CPP-badge]: https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=cplusplus&logoColor=white
[CPP-url]: https://isocpp.org/
[Firebase-badge]: https://img.shields.io/badge/Firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black
[Firebase-url]: https://firebase.google.com/
[SQLDelight-badge]: https://img.shields.io/badge/SQLDelight-3DDC84?style=for-the-badge&logo=sqlite&logoColor=black
[SQLDelight-url]: https://cashapp.github.io/sqldelight/
[Gradle-badge]: https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white
[Gradle-url]: https://gradle.org/
