if [ "$TRAVIS_PULL_REQUEST" == "false" ]; then
  echo -e "Updating mutation coverage result in gh-pages..\n"

  #copy data we're interested in to other place
  cp -R /home/travis/build/Mama59/CauseEffectChain/target/pit-reports $HOME/mutationcoverage

  #go to home and setup git
  cd $HOME
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "Travis"

  #using token clone gh-pages branch
  git clone --quiet --branch=gh-pages https://${GH_TOKEN}@github.com/Mama59/CauseEffectChain.git  gh-pages > /dev/null

  #go into diractory and copy data we're interested in to that directory
  cd gh-pages
  cp -Rf $HOME/mutationcoverage/* .

  #add, commit and push files
  git add -f .
  git commit -m "New mutation coverage result"
  git push -fq origin gh-pages > /dev/null

  echo -e "New mutation coverage result pushed to gh-pages!\n"
fi 
