set nocompatible        " Use Vim defaults (much better!)
set bs=2                " allow backspacing over everything in insert mode
set noai                " disable autoindenting
set nobackup            " do not keep a backup file
set noundofile          " do not create '.<file>.un~' files
set noswapfile          " do not use swap files
set viminfo=            " disable creation of ~/.viminfo files
set history=50          " keep 50 lines of command line history
set ruler               " show the cursor position all the time

set expandtab           " insert spaces instead of tabs

" Set paste mode so pasting into a buffer does not go crazy with auto indent
set paste
