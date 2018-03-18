#!/usr/bin/perl

use strict;
use warnings;

my $list1 = $ARGV[0];
my $list2 = $ARGV[1];

my %id_list;

open(INID, $list1);
while(<INID>){
    chomp($_);
    $id_list{$_} = 1;
}
close(INID);

open(INID2,  $list2);
open(OUT_DUPL,  ">./dupl.txt");
open(OUT_ONLY2,  ">./only_list2.txt");
while(<INID2>){
    chomp($_);
    if( exists( $id_list{$_} ) ){
        printf OUT_DUPL ("%s\n",  $_);
    } else {
        printf OUT_ONLY2 ("%s\n",  $_);
    }
}
close(INID2);
close(OUT_DUPL);
close(OUT_ONLY2);

