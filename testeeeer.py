from pytube import Playlist
import os

def get_playlist_urls(playlist_url, output_file):
    # Create a Playlist object from the given URL
    playlist = Playlist(playlist_url)

    # Get the URLs of all videos in the playlist
    video_urls = [video.watch_url for video in playlist.videos]

    # Create the output directory if it doesn't exist
    output_dir = os.path.dirname(output_file) or '.'
    os.makedirs(output_dir, exist_ok=True)

    # Write the URLs to the output file
    output_file_path = os.path.join(output_dir, os.path.basename(output_file))
    with open(output_file_path, 'w', encoding='utf-8') as f:
        for url in video_urls:
            f.write(f"{url}\n")

    print(f"Video URLs saved to {output_file_path}")

if __name__ == "__main__":
    playlist_url = input("Enter the YouTube playlist URL: ")
    output_file = input("Enter the output file path (e.g., output.txt): ")
    get_playlist_urls(playlist_url, output_file)