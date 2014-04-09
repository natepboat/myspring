==============================
Writing handbook in rst format
==============================

ReST - Restructured Text - is a document format superior to apt and markdown.
Guidelines for setup and format can be found at:
http://sphinx-doc.org/rest.html

Useful setup for writing ReST
-----------------------------

You need an editor which supports formatting ReST. It is known that emacs supports
this out of the box, and that IntelliJ has a plugin. It is reasonable to assume
that other editors also offers support for RST.

You want to use some functionality for automatic reloading RST pages after saved
changes. For linux, you can use the *inotify-tools* for this. See the script
file *inotify_loop.sh* in the handbook docs directory for inspiration.

It is rather boring to have to reload the pages in the browser after a change. 
Install a reload tool, such as 
https://addons.mozilla.org/en-US/firefox/addon/auto-reload/?src=api

Initial project setup
^^^^^^^^^^^^^^^^^^^^^

The following are the steps needed for setting up your project for RST documentation:

* The directory you want is *docs* on the top level of a project.

* Install and use `sphinx`_ for initial document structure. The quickstart should
  give a sufficient starting point::

    sphinx-quickstart 

* You will want to adjust the configuration somewhat. Change to the following in the
  **Makefile**. It makes the build fail when having an error. (Yes, you want this.)::

    SPHINXOPTS    = -W

* Add your project to the `build-rst-docs.sh` in the tools project. 

* Change the handbook jenkins setup to build the handbook upon changes in your project.

.. References:

.. _sphinx : http://sphinx-doc.org/
