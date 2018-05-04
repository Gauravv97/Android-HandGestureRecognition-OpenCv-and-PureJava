
cmake_minimum_required(VERSION 3.4.1)

add_library( # Specifies the name of the library.
             HandGestureApp

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/jni/jni_process.cpp )