# 📱 Experiment 5 – Android Notifications

## Create an Android Application to Display Notifications

---

## 👨‍💻 Student Details

**Name:** Manikandan P  
**USN:** 25MCAR0186  
**Subject:** Mobile Application Development Lab  

---

## 🎯 Aim

To develop an Android application using Android Studio and Kotlin that demonstrates how to create and display notifications after successful student registration.

---

## 📖 Experiment Description

This experiment demonstrates the implementation of **Android Notifications** using Kotlin.

The application provides an attractive student registration form. The user enters their personal and academic details and clicks the **REGISTER** button.

After successful registration, the application displays an Android notification informing the user that the registration was completed successfully.

### Scenario

The application simulates a **Student Registration System**.

```text
Student Registration
        ↓
Enter Student Details
        ↓
Select Course
        ↓
Accept Terms & Conditions
        ↓
Click REGISTER
        ↓
Registration Successful
        ↓
🔔 Android Notification
```

---

## 🧠 Concept / Technology Used

### Android Notifications

Notifications allow an Android application to provide information to the user outside the application's main interface.

This application uses the following Android components:

- **NotificationManager** – Manages and displays notifications.
- **NotificationChannel** – Creates a notification channel for Android 8.0 and above.
- **NotificationCompat.Builder** – Builds the notification.
- **POST_NOTIFICATIONS Permission** – Required for Android 13 and above.
- **Kotlin** – Used for application logic.
- **XML** – Used to design the user interface.
- **Android Studio** – Used for application development.

---

## 🚀 Features

- 🎓 Attractive student registration interface
- 👤 Full Name field
- 🆔 USN field
- 📧 Email field
- 📱 Mobile Number field
- 🎓 Course selection
- ☑️ Terms & Conditions checkbox
- ✅ Registration validation
- 🔔 Registration successful notification
- 🌌 Gradient background
- ✨ Custom student logo
- 🪟 Glass-style registration card
- 📱 Notification support for modern Android versions

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Android Studio | Application Development |
| Kotlin | Programming Language |
| XML | User Interface Design |
| Android SDK | Android Development |
| NotificationManager | Notification Management |
| NotificationChannel | Notification Channel |
| NotificationCompat | Notification Creation |

---

# 📂 Project Structure

```text
app
│
├── manifests
│   └── AndroidManifest.xml
│
├── java
│   └── Exp5
│       └── MainActivity.kt
│
├── res
│   │
│   ├── drawable
│   │   ├── gradient_bg.xml
│   │   ├── card_bg.xml
│   │   ├── edittext_bg.xml
│   │   ├── button_bg.xml
│   │   ├── logo_bg.xml
│   │   └── ic_student.xml
│   │
│   ├── layout
│   │   └── activity_main.xml
│   │
│   └── values
│       ├── colors.xml
│       ├── strings.xml
│       └── themes.xml
│
└── Gradle Scripts
```

---

# 🎨 User Interface

The application contains a modern student registration interface with:

- Student logo
- Student Registration heading
- Personal Details section
- Full Name
- USN
- Email Address
- Mobile Number
- Course selection
- Terms & Conditions
- Register button

---

# 🧪 Test Cases

## Test Case 1 – Application Launch

### Objective

To verify that the application launches successfully and displays the registration page.

### Input

Launch the application.

### Expected Result

The Student Registration page should be displayed successfully with the student logo, input fields, course selection, Terms & Conditions checkbox, and Register button.

### Actual Result

The application launched successfully and displayed the Student Registration page.

### Status

✅ **Passed**

### Screenshot

```text
images/testcase1.png
```

---

# 🧪 Test Case 2 – Fill Registration Details

### Objective

To verify that the application accepts valid student registration details.

### Input

```text
Name: Manikandan P
USN: 25MCAR0186
Email: manikandan021103@gmail.com
Mobile Number: 9876543210
Course: MCA
Terms & Conditions: Accepted
```

### Expected Result

The application should accept all valid registration details and allow the user to click the Register button.

### Actual Result

All registration details were entered successfully.

### Status

✅ **Passed**

### Screenshot

```text
images/testcase2.png
```

> **Note:** This screenshot shows the student's **Name and USN** as required for the GitHub submission.

---

# 🧪 Test Case 3 – Display Registration Notification

### Objective

To verify that a notification is displayed after successful registration.

### Input

Click the **REGISTER** button after entering valid details and accepting the Terms & Conditions.

### Expected Result

An Android notification should appear with the message:

```text
Registration Successful

Welcome Manikandan P!
Your student registration has been
completed successfully.
```

### Actual Result

The Registration Successful notification was displayed correctly in the Android notification panel.

### Status

✅ **Passed**

### Screenshot

```text
images/testcase3.png
```

---

# 🎓 Learning Outcomes

After completing this experiment, the following concepts were understood:

- Creating Android notifications
- Creating Notification Channels
- Using `NotificationManager`
- Using `NotificationCompat.Builder`
- Handling notification permissions
- Handling button click events
- Performing form validation
- Designing attractive Android user interfaces using XML
- Implementing notifications using Kotlin
