cmake_minimum_required(VERSION 3.22.1)

project(miniaudio-jni)

# Define miniaudio as a single source (implementation is in header)
add_library(miniaudio-jni SHARED
    miniaudio_wrapper.c
)

# Include miniaudio header
target_include_directories(miniaudio-jni PRIVATE .)

# Link Android log lib (for __android_log_print if you add logging)
find_library(log-lib log)
target_link_libraries(miniaudio-jni ${log-lib})