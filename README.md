Blog Reader App
Description
The Blog Reader App allows users to explore a list of blogs fetched from a WordPress API. Users can view blog posts in a list format, and when a user clicks on any blog post, they are taken to a detailed screen where they can read the full content of the blog.

This project demonstrates:

Fetching data from a remote API (WordPress REST API)
Using Jetpack Compose for building the UI
Handling navigation with Jetpack Navigation Compose
Implementing offline handling and caching
Pagination for loading blog posts efficiently
Features
View a list of blog posts with title and excerpt.
Click on a blog post to view its full content.
Handle offline scenarios with cached data.
Efficient data loading and pagination for long lists.
Screenshots
Blog List Screen
This is the main screen where users can see a list of available blog posts.
![WhatsApp Image 2024-11-16 at 15 35 17_7d314df4](https://github.com/user-attachments/assets/e166a2cc-7c4b-48a9-83a6-c7c9cd02399e)


Individual Blog Content Screen
This screen displays the full content of a selected blog post inside a WebView.
![WhatsApp Image 2024-11-16 at 15 35 17_4047d226](https://github.com/user-attachments/assets/b9228b01-dc97-4585-beb7-0051d99b9a13)


Installation
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/blogreader.git
Open the project in Android Studio.

Make sure you have the necessary SDKs and dependencies installed.

Build and run the project on an emulator or device.

How It Works
MainScreen: Displays a list of blog posts fetched from the WordPress API. Each blog post shows its title and excerpt.
BlogDetailScreen: Displays the full content of a selected blog post in a WebView.
Navigation: The app uses NavHost and NavController from Jetpack Navigation Compose to navigate between the list screen and the detail screen.
Retrofit: The app uses Retrofit to fetch data from the WordPress REST API.
Pagination: As the user scrolls through the list, more blog posts are fetched automatically.
Technologies Used
Kotlin
Jetpack Compose
Retrofit for network requests
Navigation Component (Jetpack Navigation Compose)
WebView for displaying blog content
Offline Handling
The app uses an in-memory cache to store blog posts, allowing it to work offline by loading cached data when the network is unavailable.

Future Improvements
Implement Room or other local storage for better offline support.
Improve UI and add features like search, sorting, or filtering.
License
This project is licensed under the MIT License - see the LICENSE file for details.
