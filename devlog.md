## TAAL
TAAL – which stands for (Tanishq, Ananya, Lavanya, Anshul). A beginner friendly music making software. Avaiable on all android, iOS, windows, MacOS and linux.

---

### What makes us unique from others
- Make music from anywhere.
- Easy to use interface, yeah even if you are not familiar with audio editing terminnologies.
- Different modes – Beginner, Expert, Master.
- Free and Open Source, made with ❤️

## Devlogs #0
*28-02-2026* ~by [Anshul Badhani](https://www.github.com/anshulbadhani)

Among all the brillant ideas discussed by our team. This one stood out the most and liked by everyone. All of us (our team) have experienced this, on random days we get a bit of motivation to make some dope music. But, the learning curve is too steep to even begin with something basic. Lots of terms related to audio editing, many types of file formats. Its all a mess and it feel discouraging us from making something which is our own. To tackle the same problem, we collectively decided to make an easy to use music software where we can make beats edit audio recordings.

Our main focus of this project would be the UX part, specially on phones. We, as a team agreed that in India most of the people use smartphones to create content. Specially, small creators because of various reasons. We believe that making music easier to create for a beginner would democratize content creation by making it more accessible (and we could also test cool ideas quickly :P).

Quickly summarizing and defining a very very rough roadmap and objectives.

#### Our Purpose
As mentioned above.

#### Target Audience
Beginners who just want to create something and test their goofy ideas without diving deep into how to use this software or wth this setting do.

#### Things we would keep in mind
- Ease of use > Number of features.
- Must work on smartphones.
- Documenting the development would be cool lol. So, we can look back at this.
- Complete this a few days before our college exams :(
- 30 minutes per member per day > 12 hour marathons.

#### Tech-Stack (not final though)
- Kotlin with cmp
- C++ or rust for performance critical code (using jni)
We will have more discussion about that along with repo setup tmrw.

Bye :P

## Devlog #1
*01-03-2026* ~by [Anshul Badhani](https://www.github.com/anshulbadhani)
Welcome back to our devlog, today is the first day of FOSSHACK. Here is what advances we made:
- [Lavanya](https://www.github.com/Lavanya24R) made some prototype UI designs.
- [Tanishq](https://github.com/Tanishq172006) and [Ananya](https://github.com/ananyatiwari05) worked on the inital setup for our project. Testing it on both Android and iOS respectively.
- [Anshul](https://www.github.com/anshulbahdani) got familiar with Kotlin.

Now, in today's meet we decided three things: What to do tomorrow, What will be our tech stack and what are the features we would have to implement before implementing our USP.

So, we decided that we will be working on Android studio (PandaOne) with Kotlin and C++ (or maybe Rust) for performace critical parts. For minimal implementation we would have to implement sounds importing/exporting features, tracks creation and editing feature and figure out how to save user's project state before working on other stuff. Our goal would be to make it modular so we can change stuff quickly.

For tomorrow. We are going to do this:
- [Tanishq](https://github.com/Tanishq172006) and [Ananya](https://github.com/ananyatiwari05) will work on menus which won't be changing drastically, like new project screen or beginner/intermediate or advanced user prompt.
- [Lavanya](https://www.github.com/Lavanya24R) will explore more ideas for UI and refine the existing designs.
- [Anshul](https://www.github.com/anshulbahdani) will be figuring out AudioEngine part and what would we require.

After a long chit chat after our meet we will be sleeping a good sleep after a tiring day :D

## Devlog #2  
*02-03-2026* ~by [Lavanya Rastogi](https://www.github.com/Lavanya24R)

Welcome back to our devlog! Day 2 was focused on strengthening our foundation — refining UI, setting up cross-platform support, and researching about the Audio Engine. The progress made by each were: 

- [Tanishq](https://github.com/Tanishq172006) built the beats activity skeleton and implemented its base UI design.
- [Ananya](https://github.com/ananyatiwari05) successfully set up Xcode on macOS for iOS development, added simulators, tested sample code to verify everything works properly, and cloned the project repository to ensure the project runs smoothly on iOS.
- [Anshul](https://www.github.com/anshulbahdani) worked on researching the Audio Engine architecture, focusing on: Smooth task scheduling, efficient audio playback handling and seamless application of effects like reverb, flanger etc.
- [Lavanya](https://www.github.com/Lavanya24R) designed UI layouts for laptop/PC, optimized mobile UI, explored FL Studio for inspiration, and studied other music apps to refine the instruments interface and overall UX.

 We decided that instead of building the Audio Engine components from scratch(not feasible within hackathon constraints) we will be using open-source technologies which will be more scalable and realistic. Therefore, the best primary option would be Media3, with FFmpeg as a fallback if required. For the UI, we will keep the paint and delete features in our app just like FL Studio, decided on what click does what for beats and keep horizontal mode as default for good instrument UI.

### For Tomorrow
- [Tanishq](https://github.com/Tanishq172006) will implement the second canvas screen, refactor and clean up the beats activity code
- [Ananya](https://github.com/ananyatiwari05) will work on the first two activity pages of the app (initial screens flow).
- [Anshul](https://www.github.com/anshulbahdani) will research on how to integrate Audio Engine libraries into our CMP app architecture.
- [Lavanya](https://www.github.com/Lavanya24R) will clone the repository and start implementing UI add-ons and improvements into the project

Day 2 gave us the base UI design with set up on different platforms. 

After a final run of the desktop version of the app we will be able to give up on our coffees and pick up our blankets ;)



## Devlog #3

*03-03-2026* ~by [Tanishq Pandey](https://github.com/Tanishq172006)

Welcome back to our devlog! Today focused on strengthening functionality, fixing cross-platform issues, and making the app more dynamic and stable. The progress made by each were:

- [Ananya](https://github.com/ananyatiwari05) corrected the audio files for iOS, created the first two pages shown when the app starts, and linked all the pages together to complete the initial flow.
- [Anshul](https://github.com/anshulbahadani) set up Android Studio and cloned the repository. The audio which previously played locally is now running through Media3. He also researched a low-latency C++ audio engine and created a demo to explore implementing it into the main app.
- [Lavanya](https://github.com/Lavanya24R) cloned the repository, refined the UI, added features like a metronome, and fixed the toggle UI for smoother interaction.
- [Tanishq](https://github.com/Tanishq172006) created the dialog box to add tiles, made the entire system dynamic, implemented save and create options, added toggle functionality, developed the second main page (canvas — beta version xD) where the main mixing will be done, and fixed desktop compatibility (now working smoothly).
We are now moving from static structure to dynamic functionality across all platforms.

### For Tomorrow

- [Anshul](https://github.com/anshulbahadani) will figure out the C++ low latency audio engine across all platforms and research how to implement a local database in CMP using Room.
- [Ananya](https://github.com/ananyatiwari05) will research how to implement brush-like functionality similar to FL Studio (mainly on Android) and explore implementing a local database in CMP using Room.
- [Lavanya](https://github.com/Lavanya24R) will research implementing a local database in CMP using Room and explore how waves can be implemented.
- [Tanishq](https://github.com/Tanishq172006) will research wave implementation and continue improving the working of the second screen.

Happy Holi to whoever is reading this :)



## Devlog #4
*04-03-2026* ~by [Ananya Tiwari](https://www.github.com/ananyatiwari05)

Happy Holi<3. Today was a mix of colors and code. We did play Holi (priorities balanced 😋), but we also pushed forward on some core architectural and feature research for our app.

- [Tanishq](https://github.com/Tanishq172006) Added the canvas and optimized its behavior across platforms. Implemented tiles system and introduced a long-press feature on piano tiles which opens a dedicated piano UI. Added persistance throughout the OS's.
- [Ananya](https://github.com/ananyatiwari05) Researched the Brush feature inspired by FL Studio’s piano roll workflow. Explored grid generation logic and piano roll grid structuring for better note placement precision.
- [Anshul](https://www.github.com/anshulbahdani) Explored different audio engine options suitable for low-latency music production apps and compared their integration feasibility with Kotlin Multiplatform.
- [Lavanya](https://www.github.com/Lavanya24R) Researched Room database, understanding its setup, dependencies, annotations, and how it can be structured cleanly within our project architecture.

For tomorrow. We plan to:
- [Tanishq](https://github.com/Tanishq172006) Implement long-press audio logic for instrument tiles. Add highlight color inversions. Introduce dropdowns on the second screen to allow instrument selection and tile number assignment.
- [Ananya](https://github.com/ananyatiwari05) Research database strategies- Firebase Authentication for user handling, SQLite for local storage, and deeper study of Room in Kotlin app development.
- [Anshul](https://www.github.com/anshulbahdani) Research and start implementing JUCE (or another suitable low-latency audio engine) and test basic sound output integration within the app.
- [Lavanya](https://www.github.com/Lavanya24R) Begin implementing Room database in the actual app structure.

Colorful and productive day ,, tataaa >.< 
