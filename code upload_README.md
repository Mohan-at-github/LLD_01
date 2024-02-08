The proper way to push a new project into an existing GitHub repository follows these steps:

Create a GitHub repository for the existing project.
Copy the GitHub URL for the new repo to the clipboard.
Perform a git init command in the root folder of the existing project.
Add all of the existing project’s files to the Git index and then commit.
Add the GitHub repo as a remote reference for the existing project.
Perform a git push operation with the -u and -f switches.
Verify that the existing project’s files have been pushed to GitHub.
How to push code to GitHub
Many DevOps professionals only want to know the Git commands necessary to push their existing project to GitHub.

To save those readers from going through the entire example, here are the Git commands used in this tutorial. These commands assume a push to a GitHub repo named existing-website, owned by a GitHub user named cameronmcnz:


git init
git add .
git commit -m "Add existing project files to Git"
git remote add origin https://github.com/cameronmcnz/example-website.git
git push -u -f origin master
