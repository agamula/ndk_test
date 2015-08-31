//
// Created by agamula on 31.08.15.
//

#ifndef NDKTEST_NDK_FOO_H
#define NDKTEST_NDK_FOO_H

#include <string.h>
#include <jni.h>

jstring Java_com_proggroup_ndktest_MainActivity_invokeNativeFunction(JNIEnv *env,
                                                                     jobject javaThis);

#endif //NDKTEST_NDK_FOO_H
